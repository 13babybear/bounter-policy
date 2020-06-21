package cn.bounter.policy.service;

import cn.bounter.policy.annotation.ClientTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 客户服务管理器
 */
@Component
public class ClientServiceManager {

    /**
     * 客户服务实现类map，key:客户枚举的value
     */
    private Map<Integer, ClientService> map;

    @Autowired
    public void setMap(List<ClientService> clientServiceList) {
        map = clientServiceList.stream()
                               .collect(Collectors.toMap(clientService -> AnnotationUtils.findAnnotation(clientService.getClass(), ClientTag.class).value().getValue(), Function.identity(), (k1, k2) -> k1));
    }

    public void process(Integer key) {
        map.get(key).process();
    }
}
