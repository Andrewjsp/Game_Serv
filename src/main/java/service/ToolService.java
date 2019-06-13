package service;

import entity.Tool;

import java.util.List;

public interface ToolService {
 List<Tool> toolsList();
 String descriptionTool(long toolId);
 Tool buyTool(long userId);
 void sellTool(long userId);
 void repairTool(long userId);
}
