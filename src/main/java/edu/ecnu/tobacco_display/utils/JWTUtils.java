package edu.ecnu.tobacco_display.utils;

import edu.ecnu.tobacco_display.model.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * Jwt工具类
 * 注意点:
 * 1、生成的token, 是可以通过base64进行解密出明文信息
 * 2、base64进行解密出明文信息，修改再进行编码，则会解密失败
 * 3、无法作废已颁布的token，除非改秘钥
 * @author TruthK
 */
public class JWTUtils {


    /**
     * 过期时间，一周
     */
    private static final long EXPIRE = 60000 * 60 * 24 * 7;
    //private  static final long EXPIRE = 1;


    /**
     * 加密秘钥
     */
    private static final String SECRET = "ecnu.tobacco";


    /**
     * 令牌前缀
     */
    private static final String TOKEN_PREFIX = "ecnu";


    /**
     * subject
     */
    private static final String SUBJECT = "ecnu";


    /**
     * 根据用户信息，生成令牌
     *
     * @param user
     * @return
     */
    public static String geneJsonWebToken(User user) {

        String token = Jwts.builder().setSubject(SUBJECT)
                .claim("head_img", user.getHeadImg())
                .claim("id", user.getUserId())
                .claim("nname", user.getNname())
                .claim("phone", user.getPhone())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                .signWith(SignatureAlgorithm.HS256, SECRET).compact();

        token = TOKEN_PREFIX + token;


        return token;
    }


    /**
     * 校验token的方法
     *
     * @param token
     * @return
     */
    public static Claims findJWT(String token) {

        try {

            final Claims claims = Jwts.parser().setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, "")).getBody();
            return claims;
        } catch (Exception e) {
            return null;
        }

    }


}
