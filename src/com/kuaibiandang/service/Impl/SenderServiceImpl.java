package com.kuaibiandang.service.Impl;

import java.sql.Timestamp;
import java.util.List;

import com.kuaibiandang.DAO.BlacklistDAO;
import com.kuaibiandang.DAO.SenderDAO;
import com.kuaibiandang.DAO.Impl.BlacklistDAOImpl;
import com.kuaibiandang.DAO.Impl.SenderDAOImpl;
import com.kuaibiandang.model.Blacklist;
import com.kuaibiandang.model.Sender;
import com.kuaibiandang.service.SenderService;

public class SenderServiceImpl implements SenderService {

	private SenderDAO senderDao = new SenderDAOImpl();
	private BlacklistDAO black = new BlacklistDAOImpl();

	@Override
	public List<Sender> getAllByStatus(int status, int start, int num) {
		return senderDao.getAllByStatus(status, start, num);
	}

	@Override
	public boolean updateStatus(String sender_id, int status) {
		return senderDao.updateSenderStatusByID(sender_id, status);
	}

	@Override
	public boolean deleteSender(String sender_id) {
		return senderDao.deleteSenderByID(sender_id);
	}

	@Override
	public long getCount(int status) {
		return senderDao.getCount(status);
	}

	@Override
	public boolean addBlack(String sender_id) {
		Sender sender = senderDao.getSenderByID(sender_id);
		Blacklist b = new Blacklist();
		b.setBlacklist_id(sender.getSender_id());
		b.setBlacklist_phonenumber(sender.getSender_phonenumber());
		b.setBlacklist_time(new Timestamp(System.currentTimeMillis()));
		senderDao.updateSenderStatusByID(sender_id, 2);
		return black.addBlacklist(b);
	}

	@Override
	public Sender findByID(String sender_id) {
		return senderDao.getSenderByID(sender_id);
	}

	@Override
	public boolean deleteBlack(String sender_id) {
		boolean status = senderDao.updateSenderStatusByID(sender_id, 1);
		boolean del = black.deleteBlacklist(sender_id);
		if(status&&del){
			return true;
		}
		return false;
	}
}
