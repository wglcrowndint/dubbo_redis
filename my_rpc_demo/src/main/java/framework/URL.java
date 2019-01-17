package framework;

import java.io.Serializable;

/**
 * Created by crowndint on 2019/1/15.
 */
public class URL implements Serializable {

    private String hostname;
    private Integer port;

    public URL(String url, Integer port) {
        this.hostname = url;
        this.port = port;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
