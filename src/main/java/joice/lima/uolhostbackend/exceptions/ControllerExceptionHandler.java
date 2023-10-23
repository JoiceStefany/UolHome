package joice.lima.uolhostbackend.exceptions;

import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {
    
    @ExceptionHandler
    public ResponseEntity threatNoSuchElementException(NoSuchElementException exception){
        ExceptionDto dto = new ExceptionDto("Essa Lista não possui mais usuários disponiveis", "400");
        return ResponseEntity.badRequest().body(null);
    }
}
