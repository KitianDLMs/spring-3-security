package com.echnelapp.login.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class UserResponse {
    String message;

    public UserResponse(String message) {
        this.message = message;
    }
}
