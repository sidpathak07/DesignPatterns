package Facade;
import Facade.models.*;
import Facade.services.*;
public class DataAnalysisManager {
    DataAnalysis da = null;

    public DataAnalysisManager(DataCollectionService dataCollectionService,
                               DataPreprocessingService dataPreprocessingService,
                               AnalysisAlgorithmService analysisAlgorithmService,
                               VisualizationService visualizationService) {
        da = new DataAnalysis(dataCollectionService, dataPreprocessingService, analysisAlgorithmService, visualizationService);
    }

    public AnalysisResult performFullAnalysis(DataCollectionParams collectionParams,
                                              PreprocessingOptions preprocessingOptions,
                                              AnalysisAlgorithmConfig algorithmConfig) {
        return da.performFullAnalysis(collectionParams, preprocessingOptions, algorithmConfig);
    }
}
