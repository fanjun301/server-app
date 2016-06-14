package cn.fanstar.server.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public abstract class AbstractRemoteFacade {

    @Autowired
    public RestTemplate restTemplate;
    @Autowired
    public RemoteConfig remoteConfig;

    protected abstract String getAppUrl();

    public String buildRemoteUrl(String action){
        if (getAppUrl().endsWith("/")){
            return String.format("%sservice/%s",getAppUrl(),action);
        }else {
            return String.format("%s/service/%s",getAppUrl(),action);
        }
    }

}
