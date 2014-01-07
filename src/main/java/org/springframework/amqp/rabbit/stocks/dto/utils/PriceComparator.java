package org.springframework.amqp.rabbit.stocks.dto.utils;

import java.util.Comparator;

import org.springframework.amqp.rabbit.stocks.dto.Price;

public class PriceComparator implements Comparator<Price> {

	public int compare(Price p1, Price p2) {
		return (int) Math.ceil(p1.getTheoretical() - p2.getTheoretical());
	}

}
