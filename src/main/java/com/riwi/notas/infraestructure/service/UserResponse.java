package com.riwi.notas.infraestructure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.notas.api.dto.request.UserReq;
import com.riwi.notas.api.dto.response.UserResp;
import com.riwi.notas.domain.entities.User;
import com.riwi.notas.domain.repository.UserRespository;
import com.riwi.notas.infraestructure.abstractCrud.IUser;
import com.riwi.notas.util.exception.BadRequestException;
import com.riwi.notas.util.messages.ErrorMessajes;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class UserResponse implements IUser{

  @Autowired
  private final UserRespository userRespository;

  @Override
  public UserResp create(UserReq request) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public UserResp update(UserReq request, String id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(String id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public Page<UserResp> getAll(int page, int size) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAll'");
  }

  @Override
  public UserResp get(String id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  private User find(String id) {
    return this.userRespository.findById(id)
        .orElseThrow(() -> new BadRequestException(ErrorMessajes.idNotFound("User")));
  }
  
}
