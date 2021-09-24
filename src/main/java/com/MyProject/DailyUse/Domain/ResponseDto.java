package com.MyProject.DailyUse.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class ResponseDto {

    private int status;

    private String code;

    private String message;

    private Object data;

    public ResponseDto(int status, String code, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public static ResponseDto getSuccessResponse() {
        return new ResponseDto(HttpStatus.OK.value(), "Success", "OK");
    }

    public static ResponseDto getSuccessResponseWithMessage(String message) {
        return new ResponseDto(HttpStatus.OK.value(), "Success", message);
    }

    public static ResponseDto getSuccessResponseWithData(Object data) {
        return new ResponseDto(HttpStatus.OK.value(), "Success", "OK", data);
    }
}
