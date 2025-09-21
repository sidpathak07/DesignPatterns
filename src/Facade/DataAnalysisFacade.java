package Facade;
import Facade.models.*;
public interface DataAnalysisFacade {
    AnalysisResult performFullAnalysis(DataCollectionParams collectionParams,
                                       PreprocessingOptions preprocessingOptions,
                                       AnalysisAlgorithmConfig algorithmConfig);
}
