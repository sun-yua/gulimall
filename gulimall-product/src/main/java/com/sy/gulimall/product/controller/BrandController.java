package com.sy.gulimall.product.controller;

import com.sy.common.utils.PageUtils;
import com.sy.common.utils.R;
import com.sy.common.valid.AddGroup;
import com.sy.common.valid.UpdateGroup;
import com.sy.gulimall.product.entity.BrandEntity;
import com.sy.gulimall.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.Map;

/**
 * 303数据校验，
 * 如果添加@null必须配合@valid使用
 * 如果分组校验group必须添加@validata使用
 */

/**
 * 品牌
 *
 * @author sunyua
 * @email sunyua@gmail.com
 * @date 2022-10-09 22:22:50
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:brand:list")
    public R list(@Validated(AddGroup.class) @RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("product:brand:info")
    public R info(@PathVariable("brandId") Long brandId){
		BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:brand:save")
    public R save(@Validated(AddGroup.class) @RequestBody BrandEntity brand/**, BindingResult bindingResult**/){
//        Map<String , String> result = new HashMap<>();
//        if(bindingResult.hasErrors()) {
//            bindingResult.getFieldErrors().stream().forEach(item -> {
//                result.put(item.getField() , item.getDefaultMessage());
//            });
//            return R.error(400 , "提交数据不合法").put("data" , result);
//        }
		brandService.save(brand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:brand:update")
    public R update(@Validated(UpdateGroup.class)@RequestBody BrandEntity brand){
		brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:brand:delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
