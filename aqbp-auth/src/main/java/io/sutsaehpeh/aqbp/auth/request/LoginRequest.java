package io.sutsaehpeh.aqbp.auth.request;

import lombok.Data;

@Data
public class LoginRequest {

    private String username;

    private String email;

    private String password;

    private Integer loginType;

}
