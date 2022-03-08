package com.example.WaterEcommerceSystem.constant;

public class SecurityConstant {
    public static final long EXPIRATION_TIME= 900000;//15MIN
    public static final String TOKEN_HEADER="Bearer";//whoever have i can take it
    public static final String  JWT_TOKEN_HEADER="Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED="Token cannot be verified";
    public static final String GET_ARRAYS_LLC="Get Arrays, LLC";
    public static final String GET_ARRAYS_ADMINISTRATION="Water Selling System";
    public static final String AUTHORITIES="Authorities";
    public static final String FORBIDDEN_MESSAGE="You need to log in to access this page";
    public static final String ACCESS_DENIED_MESSAGE="You do not have permission to access this page";
    public static final String OPTIONS_HTTP_METHOD="OPTIONS";
    public static final String[] PUBLIC_URLS={"/user/login","/user/register","/user/resetpassword/**","/user/image/**"};
}
