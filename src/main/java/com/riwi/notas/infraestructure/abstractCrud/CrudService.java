package com.riwi.notas.infraestructure.abstractCrud;

import org.springframework.data.domain.Page;

public interface CrudService<RQ, RS, ID> {
  public RS create(RQ request);
  
  public RS update(RQ request, ID id);

  public void delete(ID id);

  public Page<RS> getAll(int page, int size);
}
