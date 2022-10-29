package xiaohuihui.feign;

import com.xiaohuihui.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import xiaohuihui.feign.fallback.ProductFallback;

/**
 * @author xiaohuihui
 * @version 1.0.0
 * @package xiaohuihui.feign
 * @description
 * @date 2022/10/28 17:53
 * @Copyright
 * @link
 */
@FeignClient(value = "product-service", fallback = ProductFallback.class)
public interface ProductFeign {

    @RequestMapping("/product/{pid}")
    Product queryProductByPid(@PathVariable("pid") Integer pid);
}
