package com.riwi.notas.infraestructure.abstractCrud;

import com.riwi.notas.api.dto.request.NoteReq;
import com.riwi.notas.api.dto.response.NoteResp;

public interface INote  extends CrudService<NoteReq, NoteResp, String>{
  
}
