package com.kuaibiandang.duanxin;

import java.util.List;
import java.util.Random;

import com.shcm.bean.BalanceResultBean;
import com.shcm.bean.SendResultBean;
import com.shcm.send.DataApi;
import com.shcm.send.OpenApi;

public class Duanxin {
	private String phonenumber;
	private String message = null;// 使用json返回单个值
	private static String sOpenUrl = "http://smsapi.c123.cn/OpenPlatform/OpenApi";
	private static String sDataUrl = "http://smsapi.c123.cn/DataPlatform/DataApi";

	// 接口帐号
	private static final String account = "1001@500975860001";
	// 接口密钥
	private static final String authkey = "5E2D08E359ABE59F747EAB65F0693091";
	// 通道组编号
	private static final int cgid = 52;
	// 默认使用的签名编号(未指定签名编号时传此值到服务器)
	private static final int csid = 0;

	public static List<SendResultBean> sendOnce(String mobile, String content)
			throws Exception {
		// 发送短信
		return OpenApi.sendOnce(mobile, content, 0, 0, null);
	}

	public Duanxin(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String Send() throws Exception {
		// 发送参数
		OpenApi.initialzeAccount(sOpenUrl, account, authkey, cgid, csid);
		// 状态及回复参数
		DataApi.initialzeAccount(sDataUrl, account, authkey);
		// 取帐户余额
		BalanceResultBean br = OpenApi.getBalance();
		if (br.getResult() < 1) {
			System.out.println("获取可用余额失败: " + br.getErrMsg());
			return message;
		}
		System.out.println("可用条数: " + br.getRemain());

		int random = new Random().nextInt(89999) + 10000;
		List<SendResultBean> listItem = sendOnce(phonenumber,
				"快便当信息科技有限公司短信验证码为：" + random + "请不要告诉任何人哟");
		this.message = Integer.toString(random);

		if (listItem != null) {
			for (SendResultBean t : listItem) {
				if (t.getResult() < 1) {
					System.out.println("发送提交失败: " + t.getErrMsg());
				}

				System.out.println("发送成功: 消息编号<" + t.getMsgId() + "> 总数<"
						+ t.getTotal() + "> 余额<" + t.getRemain() + ">");
			}
		}
		return message;
		// 循环获取状态报告和回复
		/*while (true) {
			List<SendStateBean> listSendState = DataApi.getSendState();
			if (listSendState != null) {
				for (SendStateBean t : listSendState) {
					System.out.println("状态报告 => 序号<"
							+ t.getId()
							+ "> 消息编号<"
							+ t.getMsgId()
							+ "> 手机号码<"
							+ t.getMobile()
							+ "> 结果<"
							+ (t.getStatus() > 1 ? "发送成功"
									: t.getStatus() > 0 ? "发送失败" : "未知状态")
							+ "> 运营商返回<" + t.getDetail() + ">");
				}
			}

			// 取回复
			List<ReplyBean> listReply = DataApi.getReply();
			if (listReply != null) {
				for (ReplyBean t : listReply) {
					System.out.println("回复信息 => 序号<" + t.getId() + "> 回复时间<"
							+ t.getReplyTime() + "> 手机号码<" + t.getMobile()
							+ "> 回复内容<" + t.getContent() + ">");
				}
			}
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/

	}

}
