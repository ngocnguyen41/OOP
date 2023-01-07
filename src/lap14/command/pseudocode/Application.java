package lap14.command.pseudocode;

public class Application {
	public String clipboard = "";
	public Editor[] editors;
	public Editor activeEditor;
	public CommandHistory history;

	private Button copyButton;
	private Button cutButton;
	private Button pasteButton;
	private Button undoButton;
	private Shortcut shortcuts;


	public static void main(String[] args) {
		Application app = new Application();
		app.createUI();

		System.out.println("clipboard ban dau: " + app.clipboard);
		System.out.println("selection ban dau cua editor0: " + app.activeEditor.getSelection());
		app.activeEditor.replaceSelection("A");
		System.out.println("selection cua editor0 sau khi chon \"A\": " + app.activeEditor.getSelection());
		app.copyButton.onClick();
		System.out.println("clipboard sau khi bam nut copy: " + app.clipboard);
		app.activeEditor = app.editors[1];
		System.out.println("Chuyen sang editor1");
		System.out.println("selection hien tai cua editor1: " + app.activeEditor.getSelection());
		app.pasteButton.onClick();
		System.out.println("selection cua editor1 sau khi bam nut paste: " + app.activeEditor.getSelection());
		app.cutButton.onClick();
		System.out.println("selection cua editor1 sau khi bam nut cut: " + app.activeEditor.getSelection());
		app.undoButton.onClick();
		System.out.println("selection cua editor1 sau khi bam nut undo: " + app.activeEditor.getSelection());
		app.undoButton.onClick();
		System.out.println("selection cua editor1 sau khi bam nut undo: " + app.activeEditor.getSelection());
		app.activeEditor.replaceSelection("B");
		System.out.println("selection cua editor1 sau khi chon \"B\": " + app.activeEditor.getSelection());
		app.shortcuts.onPress("Ctrl+C");
		System.out.println("clipboard sau khi bam to hop phim Ctrl+C: " + app.clipboard);
		app.activeEditor = app.editors[0];
		System.out.println("chuyen sang editor0");
		System.out.println("selection cua editor0: " + app.activeEditor.getSelection());
		app.shortcuts.onPress("Ctrl+V");
		System.out.println("selection cua editor0 sau khi bam to hop phim Ctrl+V: " + app.activeEditor.getSelection());
		app.shortcuts.onPress("Ctrl+X");
		System.out.println("selection cua editor0 sau khi bam to hop phim Ctrl+X: " + app.activeEditor.getSelection());
		app.shortcuts.onPress("Ctrl+Z");
		System.out.println("selection cua editor0 sau khi bam to hop phim Ctrl+Z: " + app.activeEditor.getSelection());

	}

	public void createUI() {
		// giả sử mở 2 editor
		editors = new Editor[]{new Editor(), new Editor()};
		activeEditor = editors[0];

		copyButton = new Button();
		cutButton = new Button();
		pasteButton = new Button();
		undoButton = new Button();

		shortcuts = new Shortcut();

		history = new CommandHistory();

		Action copy = () -> executeCommand(new CopyCommand(this, activeEditor));
		copyButton.setCommand(copy);
		shortcuts.onKeyPress("Ctrl+C", copy);

		Action cut = () -> executeCommand(new CutCommand(this, activeEditor));
		cutButton.setCommand(cut);
		shortcuts.onKeyPress("Ctrl+X", cut);

		Action paste = () -> executeCommand(new PasteCommand(this, activeEditor));
		pasteButton.setCommand(paste);
		shortcuts.onKeyPress("Ctrl+V", paste);

		Action undo = () -> executeCommand(new UndoCommand(this, activeEditor));
		undoButton.setCommand(undo);
		shortcuts.onKeyPress("Ctrl+Z", undo);
	}

	public void executeCommand(Command command) {
		if (command.execute()) {
			history.push(command);
		}
	}

	public void undo() {
		Command command = history.pop();
		if (command != null) {
			command.undo();
		}
	}
}

