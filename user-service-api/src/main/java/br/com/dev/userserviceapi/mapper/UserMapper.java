package br.com.dev.userserviceapi.mapper;

import br.com.dev.userserviceapi.entity.User;
import models.responses.UserResponse;
import org.mapstruct.Mapper;

import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = IGNORE
)
public interface UserMapper {
    UserResponse fromEntity(final User user);
}
