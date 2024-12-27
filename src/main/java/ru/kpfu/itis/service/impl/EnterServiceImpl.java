package ru.kpfu.itis.service.impl;

import ru.kpfu.itis.dao.EnterDao;
import ru.kpfu.itis.dao.impl.EnterDaoImpl;
import ru.kpfu.itis.entity.Enter;
import ru.kpfu.itis.service.EnterService;

public class EnterServiceImpl implements EnterService {

    EnterDao enterDao = new EnterDaoImpl();

    @Override
    public void save(Enter enter) {
        enterDao.save(enter);
    }
}
