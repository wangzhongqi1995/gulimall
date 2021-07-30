package com.erosion.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erosion.gulimall.product.entity.PmsSkuSaleAttrValueEntity;
import com.erosion.gulimall.product.service.PmsSkuSaleAttrValueService;
import com.erosion.common.utils.PageUtils;
import com.erosion.common.utils.R;



/**
 * sku销售属性&值
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:17:55
 */
@RestController
@RequestMapping("product/pmsskusaleattrvalue")
public class PmsSkuSaleAttrValueController {
    @Autowired
    private PmsSkuSaleAttrValueService pmsSkuSaleAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:pmsskusaleattrvalue:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSkuSaleAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:pmsskusaleattrvalue:info")
    public R info(@PathVariable("id") Long id){
		PmsSkuSaleAttrValueEntity pmsSkuSaleAttrValue = pmsSkuSaleAttrValueService.getById(id);

        return R.ok().put("pmsSkuSaleAttrValue", pmsSkuSaleAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:pmsskusaleattrvalue:save")
    public R save(@RequestBody PmsSkuSaleAttrValueEntity pmsSkuSaleAttrValue){
		pmsSkuSaleAttrValueService.save(pmsSkuSaleAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:pmsskusaleattrvalue:update")
    public R update(@RequestBody PmsSkuSaleAttrValueEntity pmsSkuSaleAttrValue){
		pmsSkuSaleAttrValueService.updateById(pmsSkuSaleAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:pmsskusaleattrvalue:delete")
    public R delete(@RequestBody Long[] ids){
		pmsSkuSaleAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
