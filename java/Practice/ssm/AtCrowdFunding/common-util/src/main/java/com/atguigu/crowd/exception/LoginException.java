package com.atguigu.crowd.exception;

/**
 * @author: cgr
 * @date: 2022/7/21 - 17:32
 */
public class LoginException extends RuntimeException{
    static final long serialVersionUID = -7034897190745766939L;

    public LoginException(String message) {
        super(message);
    }

    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginException(Throwable cause) {
        super(cause);
    }

    protected LoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
