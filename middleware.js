exports.validateTask = (req, res, next) => {
  const { title } = req.body;
  if (!title || typeof title !== 'string') {
    return res.status(400).json({ error: 'Título deve ser uma string válida' });
  }
  next();
};