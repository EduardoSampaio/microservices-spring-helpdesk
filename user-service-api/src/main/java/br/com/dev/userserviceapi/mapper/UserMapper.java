package br.com.dev.userserviceapi.mapper;

import br.com.dev.userserviceapi.entity.User;
import models.requests.CreateUserRequest;
import models.responses.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = IGNORE
)
public interface UserMapper {
    UserResponse fromEntity(final User user);

    @Mapping(target = "id", ignore = true)
    User fromRequest(CreateUserRequest createUserRequest);

    //@Mapping(target = "id", ignore = true)
    //User update(UpdateUserRequest updateUserRequest, @MappingTarget User entity);
}
