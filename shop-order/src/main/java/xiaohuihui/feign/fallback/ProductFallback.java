package xiaohuihui.feign.fallback;

import com.xiaohuihui.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import xiaohuihui.feign.ProductFeign;

/**
 * @author xiaohuihui
 * @version 1.0.0
 * @package xiaohuihui.feign.fallback
 * @description
 * @date 2022/10/28 21:38
 * @Copyright
 * @link
 */
@Slf4j
@Component
public class ProductFallback implements ProductFeign {
    @Override
    public Product queryProductByPid(Integer pid) {
        log.error("fail to queryProductByPid, fallback");
        return null;
    }
}