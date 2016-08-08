package edu.stanford.nlp.coref.neural;

import java.util.Locale;
import java.util.Properties;

import edu.stanford.nlp.coref.CorefProperties;
import edu.stanford.nlp.util.PropertiesUtils;

public class NeuralCorefProperties {
  public static double greedyness(Properties props) {
    return PropertiesUtils.getDouble(props, "coref.neural.greedyness", 0);
  }

  public static String modelPath(Properties props) {
    String defaultPath = "edu/stanford/nlp/models/coref/neural/" +
        (CorefProperties.getLanguage(props) == Locale.CHINESE ? "chinese" : "english") +
        (CorefProperties.conll(props) ? "-model-conll" : "-model-conll") + ".ser.gz";
    return PropertiesUtils.getString(props, "coref.neural.modelPath", defaultPath);
  }

  public static String pretrainedEmbeddingsPath(Properties props) {
    String defaultPath = "edu/stanford/nlp/models/coref/neural/" +
        (CorefProperties.getLanguage(props) == Locale.CHINESE ? "chinese" : "english") +
        "-embeddings.ser.gz";
    return PropertiesUtils.getString(props, "coref.neural.embeddingsPath", defaultPath);
  }
}
