
package br.com.estudos.recomendador;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class RecomendaProdutos {

	public static void main(String[] args) throws TasteException, IOException {

		DataModel produtos = new Recomendador().getModeloDeProdutos();

		Recommender recommender = new RecomendadorBuilder().buildRecommender(produtos);

		List<RecommendedItem> recommendations = recommender.recommend(2, 4);
		for (RecommendedItem recommendation : recommendations) {
			System.out.println(recommendation);
		}

	}
}
