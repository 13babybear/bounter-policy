package cn.bounter.policy.service;

import cn.bounter.policy.annotation.ClientTag;
import cn.bounter.policy.enums.ClientEnum;
import org.springframework.stereotype.Component;

/**
 * Simon客户服务实现类
 */
@Component
@ClientTag(ClientEnum.SIMON)
public class SimonServiceImpl implements ClientService {

    @Override
    public void process() {
        System.out.println("do Simon service process...");
    }

}
