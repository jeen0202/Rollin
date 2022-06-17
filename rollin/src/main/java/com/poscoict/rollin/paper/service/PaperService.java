package com.poscoict.rollin.paper.service;

import com.poscoict.rollin.paper.model.PaperDto;
import com.poscoict.rollin.paper.model.PaperEntity;

import java.util.List;
import java.util.Optional;

public interface PaperService {
    List<PaperEntity> getAllPaper();

    List<PaperEntity> getPaperByUserId(Integer id);
    Boolean postPaper(PaperEntity paperEntity);
}
