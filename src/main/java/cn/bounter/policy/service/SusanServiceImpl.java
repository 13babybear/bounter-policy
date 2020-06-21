package cn.bounter.policy.service;

import cn.bounter.policy.annotation.ClientTag;
import cn.bounter.policy.enums.ClientEnum;
import org.springframework.stereotype.Component;

/**
 * Susan客户服务实现类
 */
@Component
@ClientTag(ClientEnum.SUSAN)
public class SusanServiceImpl implements ClientService {

    @Override
    public void process() {
        System.out.println("do Susan service process...");
    }

}
