package com.sy.gulimall.product.exception;

import com.sy.common.utils.R;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handlerVlidateException(MethodArgumentNotValidException e) {
        Map<String, String> result = new HashMap<>();
        BindingResult bindingResult = e.getBindingResult();
        if (bindingResult.hasErrors()) {
            bindingResult.getFieldErrors().stream().forEach(item -> {
                result.put(item.getField(), item.getDefaultMessage());
            });
        }
        return R.error(400, "提交数据不合法").put("data", result);
    }
}
