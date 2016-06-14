package cn.fanstar.server.facade;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RemoteConfig {

    @Value("${remote-app}")
    public String remoteAppURL;

    public String getRemoteAppURL() {
        return remoteAppURL;
    }

}
