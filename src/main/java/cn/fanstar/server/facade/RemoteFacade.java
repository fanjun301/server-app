package cn.fanstar.server.facade;

import cn.fanstar.server.common.SpringContextUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class RemoteFacade extends AbstractRemoteFacade {

    Logger logger = Logger.getLogger(RemoteFacade.class);

    @Override
    public String getAppUrl() {
        return remoteConfig.getRemoteAppURL();
    }

    public String test() {
        String url = buildRemoteUrl("demo");
        logger.info(String.format("remote request URL:%s",url));
        String result = restTemplate.getForObject(url, String.class);
        logger.info(String.format("remote request URL:%s, result is %s",url, result));
        return result;
    }

}
