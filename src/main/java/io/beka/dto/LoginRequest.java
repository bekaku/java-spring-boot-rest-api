package io.beka.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Getter
@JsonRootName("user")
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Accessors(chain = true)
public class LoginRequest {

    @NotBlank(message = "{error.validateRequire}")
    @Email(message = "{error.emailFormat}")
    private String email;

    @NotBlank(message = "{error.validateRequire}")
    private String password;

    @NotNull(message = "{error.validateRequire}")
    private int loginForm; //REQUEST_FROM_WEB = 1, REQUEST_FROM_IOS = 2, REQUEST_FROM_ANDROID = 3
}
