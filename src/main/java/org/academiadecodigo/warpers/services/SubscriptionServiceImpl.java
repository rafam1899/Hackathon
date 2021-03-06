package org.academiadecodigo.warpers.services;

import org.academiadecodigo.warpers.persistence.dao.SubscriptionDao;
import org.academiadecodigo.warpers.persistence.dao.UserDao;
import org.academiadecodigo.warpers.persistence.model.Subs;
import org.academiadecodigo.warpers.persistence.model.subscription.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    private SubscriptionDao subscriptionDao;
    private UserDao userDao;


    @Autowired
    public void setSubscriptionDao(SubscriptionDao subscriptionDao) {
        this.subscriptionDao = subscriptionDao;
    }


    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public Subs get(Integer id) {
        return subscriptionDao.findById(id);
    }

    @Override
    public List<Subs> list() {
        return subscriptionDao.findAll();
    }

    @Override
    public Subs save(Subs subscription) {
        return subscriptionDao.saveOrUpdate(subscription);
    }
}
