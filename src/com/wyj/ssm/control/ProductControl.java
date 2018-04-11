package com.wyj.ssm.control;

import com.wyj.ssm.pojo.Product;
import com.wyj.ssm.service.ProductService;
import com.wyj.ssm.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/7.
 */
@Controller
public class ProductControl {
    Map<String, Object> map;

    @Autowired
    ProductService productService;

    @RequestMapping("/index")
    public ModelAndView productfind(Page page, ModelAndView modelAndView, HttpSession session) {
        map = new HashMap<String, Object>();
        int count = productService.ProductCount();
        page.setPageCount(count);
        map.put("pageNo", (page.getPageNo() - 1) * page.getPageSize());
        map.put("pageSize", page.getPageSize());
        List<Product> products = productService.productfind(map);
        page.setProducts(products);
        session.setAttribute("page", page);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/add")
    public String add() {
        return "add";
    }

    @RequestMapping("/addproduct")
    public ModelAndView addproduct(ModelAndView modelAndView, Product product) {
        int count = productService.addproduct(product);
        if (count > 0) {
            modelAndView.setViewName("redirect:index");
        } else {
            modelAndView.setViewName("add");
        }
        return modelAndView;
    }

    @RequestMapping("/delproduct")
    public ModelAndView delproduct(int id, ModelAndView modelAndView) {
        int count = productService.delproduct(id);
        if (count > 0) {
            modelAndView.setViewName("redirect:index");
        } else {
            modelAndView.setViewName("redirect:index");
        }
        return modelAndView;

    }

    @RequestMapping("/update")
    public String update(int id, HttpSession session) {
        Product product = productService.productbyid(id);
        session.setAttribute("product", product);
        return "update";
    }

    @RequestMapping("/updateproduct")
    public ModelAndView updatepr(Product product, ModelAndView modelAndView) {
        int count = productService.updateproduct(product);
        if (count > 0) {
            modelAndView.setViewName("redirect:index");
        } else {
            modelAndView.setViewName("redirect:index");
        }
        return modelAndView;
    }
}
