package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@JsonIgnoreProperties(ignoreUnknown=true)
@Data
@Accessors(chain=true)
@TableName("tb_item")

public class Item extends BasePojo{


	@TableId(type=IdType.AUTO)
	private Long id;
	private String title;
	private String sell_point;
	private Long price;
	private Integer num;
	private String barcode;
	private String image;
	private Long cid;
	private Integer status;
	
	
	public String[] getImages() {
		return image.split(",");
	}
	

}




