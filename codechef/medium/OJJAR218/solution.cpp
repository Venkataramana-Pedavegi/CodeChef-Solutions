import  { useState } from 'react';
import { produce } from 'immer';

// 1. Import the CSS file
import './App.css';

// Initial state data (same as before)
const initialEventsData = [
  {
    eventId: 'coffee-with-samantha',
    date: '2023-01-01T12:30:00.000Z',
    metadata: {
      invitees: [
        { name: 'Samantha', email: 'samboombox123@aol.com' },
      ],
    },
  },
  {
    eventId: 'focus-time',
    date: '2023-01-01T15:00:00.000Z',
    metadata: { notes: 'Time for me to focus!' },
  },
  {
    eventId: 'team-meeting',
    date: '2023-01-02T10:00:00.000Z',
    metadata: {
      notes: 'Weekly team catch-up call!',
      invitees: [
        { name: 'Sadb Fabian', email: 'sfabian@widgetco.com' },
        { name: 'Gerarda Nicomedes', email: 'gnicomedes@widgetco.com' }, // Target for removal