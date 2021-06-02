package com.myoauthdua.myoauthdua.repository;

import com.myoauthdua.myoauthdua.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface UserDetailsRepository  extends JpaRepository<UserInfo, String> {
    public UserInfo findByUserNameAndEnabled(String userName, short enabled);

    public List<UserInfo> findAllByEnabled(short enabled);

    public UserInfo findById(Integer id);
//
//	@Override
//	public UserInfo save(UserInfo userInfo);

    public void deleteById(Integer id);
}
