package tr.edu.medipol.ij.kisiistemcisi;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class KisiController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/yazarlar")
    public List<Kisi> listele() {
        List<ServiceInstance> instances = discoveryClient.getInstances("KISI-SUNUCUSU");
        if(instances != null && !instances.isEmpty()) {
            ServiceInstance serviceInstance = instances.get(0);
            URI uri = serviceInstance.getUri();
            System.out.println("kisiSunucusuAdresi uri: " + uri);
            String url = uri.toString() + "/kisilistele";
            RestTemplate restTemplate = new RestTemplate();
            List<Kisi> yazarListesi = restTemplate.getForObject(url, List.class);
            return yazarListesi;
        }
        return null;
    }

}
