const request = require('supertest');
const app = require('../server');

test('GET /tasks retorna lista', async () => {
  const res = await request(app).get('/api/v1/tasks');
  expect(res.status).toBe(200);
  expect(Array.isArray(res.body)).toBe(true);
});