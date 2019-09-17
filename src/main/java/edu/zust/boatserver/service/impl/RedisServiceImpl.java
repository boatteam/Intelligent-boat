package edu.zust.boatserver.service.impl;

import edu.zust.boatserver.dao.UserRepository;
import edu.zust.boatserver.service.RedisService;
import edu.zust.boatserver.util.VerificationCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * 根据phone获取code
 * Created by HASEE on 2019/9/14 20:00
 */
@Service
@Slf4j
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserRepository userRepository;

    @Override
    @Cacheable("codeCache")
    public String getCode(String phone) {
        log.info("geyValue() invoked");
        return VerificationCodeUtil.getRandomCode();
    }

    @Override
    @CachePut("codeCache")
    public String cacheCode(String phone) {
        log.info("setKey() invoked");
        String code = VerificationCodeUtil.getRandomCode();
        log.info(code);
        return code;
    }

    @Override
    @Cacheable("phoneCache")
    public String getPhone(String username) {
        return userRepository.findByUsername(username).getPhone();
    }

    @Override
    @CachePut("mailCodeCache")
    public String cacheMailCode(String email) {
        return VerificationCodeUtil.getRandomCode();
    }

    @Override
    @Cacheable("mailCodeCache")
    public String getMailCode(String email) {
        return VerificationCodeUtil.getRandomCode();
    }
}
