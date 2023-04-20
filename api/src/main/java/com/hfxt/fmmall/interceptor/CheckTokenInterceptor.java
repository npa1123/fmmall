package com.hfxt.fmmall.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hfxt.fmmall.vo.ResultVO;
import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 自定义拦截器，
 *      再拦截器中放行options请求
 */
@Component
public class CheckTokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String method = request.getMethod();//获取请求头
        //放行options请求
        if ("OPTIONS".equalsIgnoreCase(method)){
            return true;
        }
        String token=request.getHeader("token");
        System.out.println("--------------"+token);
        if (token == null) {
            //提示请登录
            doResponse(response,1);
            return false;
        }else{
            try{
                //验证token
                JwtParser parser= Jwts.parser();//解析器
                parser.setSigningKey("123456"); //解析token的setSigningKey必须和生成token时设置密码一致
                //如果token正确（密码正确，有效期内）则正常运行，否则抛出异常
                Jws<Claims> claimsJws = parser.parseClaimsJws(token);
                return true;
            }catch (ExpiredJwtException e){
                doResponse(response,2);
            }catch (UnsupportedJwtException e){
                doResponse(response,3);
            }catch (Exception e){
                doResponse(response,4);
            }
        }
        return false;
    }

    private void doResponse(HttpServletResponse response,int code) throws IOException {
        //提示请登录
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String s=null;
        if (code==1){
            s= new ObjectMapper().writeValueAsString(ResultVO.error("请先登录!"));
        }else if (code==2){
            s= new ObjectMapper().writeValueAsString(ResultVO.error("登录过期，请重新登录"));
        }else if (code==3){
            s= new ObjectMapper().writeValueAsString(ResultVO.error("Token不合法，请重新登录"));
        }else if (code==4){
            s= new ObjectMapper().writeValueAsString(ResultVO.error("请重新登录"));
        }
        out.print(s);
        out.flush();
        out.close();

    }
}
