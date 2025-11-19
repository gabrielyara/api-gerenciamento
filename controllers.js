const tasks = [];

exports.getAllTasks = (req, res) => {
  res.json(tasks);
};

exports.createTask = (req, res) => {
  const { title, completed } = req.body;
  if (!title) return res.status(400).json({ error: 'Título obrigatório' });
  const newTask = { id: tasks.length + 1, title, completed: completed || false };
  tasks.push(newTask);
  res.status(201).json(newTask);
};
