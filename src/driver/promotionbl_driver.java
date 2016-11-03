package driver;

import blservice.promotionblservice;
import po.promotionPO;
import stub.promotionData_stub;

public class promotionbl_driver implements promotionblservice{
	dataservice.promotionData service = new promotionData_stub();
	public void getUser() {
		// TODO Auto-generated method stub
		service.getPromotion("541322049");
		System.out.println("成功得到订单");
	}

	@Override
	public promotionPO getPromotion(String promotionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public promotionPO[] getPromotionList() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean changePromotion(promotionPO promotion) {
		// TODO Auto-generated method stub
		System.out.println("成功更新");
		System.out.println(service.update(promotion));
		return true;
	}

	public boolean addPromotion(promotionPO promotion) {
		// TODO Auto-generated method stub
		System.out.println("成功添加");
		System.out.println(service.insert(promotion));
		return true;
	}
	
	public boolean delPromotion(promotionPO promotion) {
		// TODO Auto-generated method stub
		System.out.println("成功删除");
		System.out.println(service.delete(promotion));
		return true;
	}

	
	public static void main(String[] args) {
		promotionbl_driver driver = new promotionbl_driver();
		promotionPO p = new promotionPO("1997-3-4", 1, false, "2016-2-11", false,"12345678");
		driver.addPromotion(p);
		driver.getPromotion("1234");
		driver.getPromotionList();
		driver.changePromotion(p);
		driver.delPromotion(p);
	}



}
