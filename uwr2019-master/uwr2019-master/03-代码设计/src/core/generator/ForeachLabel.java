package core.generator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import com.aspose.words.AutoFitBehavior;
import com.aspose.words.Cell;
import com.aspose.words.CompositeNode;
import com.aspose.words.Node;
import com.aspose.words.NodeType;
import com.aspose.words.Row;
import com.aspose.words.Table;

/**
 * 统一Word报告生成系统（UWR）
 * <foreach>标签类
 * @author 张学龙
 * @author 朴勇 15641190702
 * 
 */
public class ForeachLabel {
	//变量名
	private String varname = null;
	//开始节点
	private Node begin = null;
	//结束节点
	private Node end = null;
	//父集合
	private Node family = null;
	//是否在表格中
	private boolean inTable = false;
	//原始开始节点
	private Node obegin = null;
	//原始结束节点
	private Node oend = null;
	//原始父集合节点
	private Node ofamily = null;
	//是否按列展开
	private boolean isColumn = false;
	//default value when no item
	private String defaultvalue = "";
	//separator1 and separator2
	private String midsep = "";
	private String endsep = "";
	//paragraph: all the sibling nodes in between begin and end,
	//table: first element is the row, others are cells contained.
	private List<Node> nodelist = new ArrayList<Node>();

	public String getMidsep() {
		return midsep;
	}

	public void setMidsep(String midsep) {
		this.midsep = midsep;
	}

	public String getEndsep() {
		return endsep;
	}

	public void setEndsep(String endsep) {
		this.endsep = endsep;
	}

	//是否在其中
	public boolean isPart(Node node) {
		boolean flag = false;
		return flag;
	}
	
	//节点正则化
	public static CompositeNode<?> makeNormalNode(Node node){
		return (CompositeNode<?>) node;
	}
	
	//父集合节点正则化
	public static CompositeNode<?> makeNormalFamily(Node f){	
		return (CompositeNode<?>) f;
	}
	
	//删除原始信息
	public void removeOrigin() throws Exception {
	}
	
	//获取范围
	public List<Node> getNodesInRange(){
		return nodelist;
	}
	
	//获取中间所有节点
	//顺序：reverse order
	public void fillNodesInBetween() {
	}

	public String getVarname() {
		return varname;
	}

	public void setVarname(String varname) {
		this.varname = varname;
	}
	
	public String getDefaultValue() {
		return this.defaultvalue;
	}

	public void setDefaultValue(String dv) {
	}

	public Node getBegin() {
		return begin;
	}

	public void setBegin(Node begin) {
	}

	public Node getEnd() {
		return end;
	}

	public void setEnd(Node end) {
	}

	public CompositeNode<?> getFamily() {
		return (CompositeNode<?>) family;
	}

	public void setFamily(Node f) {
	}

	public boolean isInTable() {
		return inTable;
	}

	private void setInTable(boolean inTable) {
		this.inTable = inTable;
	}

	//高维展开
	public void expand(List<Node> inserted) throws Exception {
	}
	
	//竖向展开
	private void expandInVerticalTable(List<Node> inserted) throws Exception {
	}

	//段落展开
	private void expandInParagraph(List<Node> inserted) throws Exception {
	}
	
	//横向展开
	private void expandInHorizontalTable(List<Node> inserted) throws Exception {
	}

	public void setColumn(boolean b) {
		isColumn = b;	
	}

	//使用默认值展开
	public void expandWithDefaultValue() throws Exception {
	}
}
