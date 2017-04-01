package edu.nf.dazhaohui.service.impl;

import edu.nf.dazhaohui.dao.UserDao;
import edu.nf.dazhaohui.model.User;
import edu.nf.dazhaohui.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public User getPersonById(long id) {
        return (User) userDao.findById(id);
    }
}
