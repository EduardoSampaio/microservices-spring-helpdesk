package models.exceptions;

import java.time.LocalDateTime;

public record StandardError(Integer status, String error, String message, String path, LocalDateTime timestamp) {
}
