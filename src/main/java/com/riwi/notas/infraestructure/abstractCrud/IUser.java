package com.riwi.notas.infraestructure.abstractCrud;

import com.riwi.notas.api.dto.request.UserReq;
import com.riwi.notas.api.dto.response.UserResp;

public interface IUser extends CrudService<UserReq, UserResp, String>{
  public UserResp get(String id);
}
