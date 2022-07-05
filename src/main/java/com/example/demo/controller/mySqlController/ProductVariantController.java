package com.example.demo.controller.mySqlController;

import com.example.demo.model.mySqlModel.ProductVariant;
import com.example.demo.data.mySqlData.NamePrice;
import com.example.demo.data.mySqlData.ProductId;
import com.example.demo.repository.mySqlRepository.ProductJpaRepository;
import com.example.demo.repository.mySqlRepository.ProductVariantRepository;
import com.example.demo.service.mySqlService.ProductVariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/variant")
public class ProductVariantController {

    @Autowired
    private ProductVariantRepository productVariantRepository;
    @Autowired
    private ProductJpaRepository productRepository;
    @Autowired
    private ProductVariantService productVariantService;
    @GetMapping(value="/skuCode_{skuCode}")
    public ProductVariant findByProductVariant(@PathVariable String skuCode){
        return  productVariantRepository.findBySkuCode(skuCode);
    }
    /*@GetMapping(value="/pid/{productId}")
    public ProductVariant findByProductId(@PathVariable String productId){
        return  productVariantRepository.findByProductId(productId);
    }*/
    @GetMapping(value="pid/{pid}")
    public ProductVariant findByProductId(@PathVariable String pid){
        try {
            return productVariantService.variantDetailsByPid(pid);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("inside exception  4");
            throw e;
        }

     /*try {
         List<Object> list = new ArrayList<>();
         List<ProductVariant>  result =productVariantRepository.findPrice();
         result.forEach(e->{
             Map<String,Object> map = new HashMap<>();
             map.put("product_id",e.getProductId());
             map.put("price",e.getPrice());
             list.add(map);
         });

         return list;
     }catch(Exception e) {
         return null;
     }*/
    }

    /*@GetMapping(value="/price_name")
    public List<Object> findPriceName(){
        try {
            List<Object> list = new ArrayList<>();
            List<ProductVariant>  result =productVariantRepository.findPriceName();
            result.forEach(e->{
                Map<String,Object> map = new HashMap<>();
                map.put("product_id",e.getProductId());
                map.put("price",e.getPrice());

//                String pid=e.getProductId();
//                   ProductController pc=new ProductController();
//                   ProductDetails pDetails= pc.findByProductId(pid);
//                   System.out.println("pDetails");
//                   System.out.println("pDetails");
                        list.add(map);
            });

            return list;
        }catch(Exception e) {
            System.out.println("exception");
            e.printStackTrace();
            return null;
        }
    }*/
    @GetMapping(value = "/price")
    public List<Object> variantPrice(){
        try {
            return productVariantService.priceDetails();
        } catch (Exception e) {
            System.out.println("exception 5");
            throw new RuntimeException(e);
        }
    }
    @GetMapping(value = "/namePrice")
    public List<Object> namePrice(){
        try {
            return productVariantService.namePriceDetails();
        } catch (Exception e) {
            System.out.println("exception 5");
            throw new RuntimeException(e);
        }
    }
    @GetMapping(value="/namePriceObj")
    public List <NamePrice> findNamePrice(){
        try{
            return productVariantService.namePriceObj();
        }catch (Exception e){
            System.out.println("jay ho");
            return null;
        }
    }
  /*  @PostMapping(value = "/userInput")
    public NamePrice findNamePrice(@RequestBody String pId){
        try{
            return productVariantService.namePriceObj(new JSONObject(pId).optString("productId"));
        }catch (Exception e){
            System.out.println("nothing found");
            return new NamePrice("gp bs",0.00000,"kahich nahi sapdl");
        }
    }*/
    @PostMapping(value = "/userInput")
    public NamePrice findNamePrice(@RequestBody ProductId pId){
        try{
            System.out.println(pId.getProductId());
            return productVariantService.namePriceObj(pId.getProductId());

        }catch (Exception e){
            System.out.println("mi nay det ja");
            return new NamePrice("gp bs",0.00000,"kahich nahi sapdl");
        }
    }
}